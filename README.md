# Learn_Interview

## Java
* [JVM 虚拟机相关](jvm/jvm.md)
* [String相关的操作，字符串在常量池、堆内存的存在方式，很详细很有意思的一篇博客](https://www.jianshu.com/p/d416a074409d)
* [HashMap实现原理及源码分析](https://www.cnblogs.com/chengxiao/p/6059914.html)  
> 1、HashMap支持null Key和null Value；Hashtable不允许。这是因为HashMap对null进行了特殊处理，将null的hashCode值定为了0，从而将其存放在哈希表的第0个bucket；  
> 2、HashMap是非线程安全，HashMap实现线程安全方法为Map map = Collections.synchronziedMap(new HashMap())；Hashtable是线程安全；  
> 3、HashMap默认长度是16，扩容是原先的2倍；Hashtable默认长度是11，扩容是原先的2n+1；  
> 4、HashMap继承AbstractMap；Hashtable继承了Dictionary；  
> 扩展，HashMap 对比 ConcurrentHashMap ，HashMap 对比 SparseArray，LinkedArray对比ArrayList，ArrayList对比Vector。    



## Android
### ANR 异常
* [android ANR、traces文件获取及实例分析](https://blog.csdn.net/cui130/article/details/82686732)
* [Android ANR log trace日志文件分析](https://blog.csdn.net/qq_25804863/article/details/49111005)

## 数据结构&算法
[算法学习](https://github.com/zdy793410600/Learn_Algorithm)


## 网络

1、[Https(SSL/TSL)原理之深入浅出](https://www.cnblogs.com/digdeep/p/4832885.html)
