package jvm;

/**
 * JMM: Java Memory Model(java内存模型)
 *
 * 由于JVM运行程序的实体是线程，而每个线程创建时，
 * JVM都会为其创建一个工作内存（有些地方称为栈空间），工作内存是每个线程的私有数据区域。
 * 而Java内存模型中规定所有变量都存储在主内存，主内存是共享内存区域，所有线程都可以访问。
 * 但线程对变量的操作（读取赋值等）必须在工作内存中进行，首先要将变量从主内存拷贝到线程自己的工作内存空间，
 * 然后对变量进行操作，操作完成后，再将变量写回主内存。而不能直接操作主内存中的变量，
 * 各个线程中的工作内存中存储着主内存中的变量副本拷贝，因此不同的线程间无法访问对方的工作内存，
 * 线程间的通信（传值）必须通过主内存来完成。
 */
public class JMMNote {
}
