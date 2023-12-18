class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i);
        }
    }
}

public class Mthreading {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.start();
    //    try {
    //     t1.sleep(60000);
    //    } catch (Exception e) {
    //     System.err.println(e);
    //    } 

        MyThread t2 = new MyThread();
        t2.start();
    }
}

//Multi threading: Multithreading refers to a process of executing two or more threads simultaneously for maximum utilization of the CPU.

/*yield(): The yield() method is a hint to the scheduler that the current thread is willing to release its current time slice, allowing other threads to run. However, there is no guarantee that the scheduler will honor this hint.
join():

The join() method is used to wait for a thread to complete its execution. When a thread calls join() on another thread, the calling thread is blocked until the thread it joined completes. It's useful for coordinating the execution of multiple threads.
sleep():

The sleep() method is used to pause the execution of the current thread for a specified amount of time. It allows other threads to run during this sleep period. It is often used for introducing delays or scheduling in a program. */