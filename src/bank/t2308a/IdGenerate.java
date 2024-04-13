package bank.t2308a;

import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {
    private static Long id = 0L;
    private static ReentrantLock lock = new ReentrantLock();

    public static Long getNewID() {
        Long result;
        lock.lock(); // Khóa biến id lại chỉ cho duy nhất một thread được truy xuất cấp để tránh tình trạng Data Racing!
        try {
            result = ++id; // Tăng rồi gán vào result
        } finally {
            lock.unlock(); // Tăng rồi thì mở lock cho thread khác cùng truy cập
            // Nhiều như mình đang xong nhà vệ sinh thì ra thì đói thời.
        }
        return result;
    }

    private IdGenerate() {
        // Constructor is private to prevent instantiation
    }
}
