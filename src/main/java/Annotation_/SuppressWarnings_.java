package Annotation_;

import java.util.ArrayList;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-07 9:19
 */


public class SuppressWarnings_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack1");
        arrayList.add("jack2");
        arrayList.add("jack3");
    }
    public void f1(){
        @SuppressWarnings("rawtypes")
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("jack1");
        arrayList.add("jack2");
     }
}

//解读：
//1，当我们不想看到这些警告的时候，可以使用SuppressWarnnings 注解来一致警告信息
//2. 在{”“}中，可以写入你希望抑制（不显示）警告信息
//3.可以指定的警告类型有
// all，抑制所有警告
// boxing，抑制与封装/拆装作业相关的警告 //
// cast，抑制与强制转型作业相关的警告 //
// dep-ann，抑制与淘汰注释相关的警告 //
// deprecation，抑制与淘汰的相关警告 //
// fallthrough，抑制与 switch 陈述式中遗漏 break 相关的警告 //
// finally，抑制与未传回 finally 区块相关的警告 //
// hiding，抑制与隐藏变数的区域变数相关的警告 //
// incomplete-switch，抑制与 switch 陈述式(enum case)中遗漏项目相关的警告 //
// javadoc，抑制与 javadoc相关的警告
// //nls，抑制与非 nls 字串文字相关的警告 //
// null，抑制与空值分析相关的警告 //
// rawtypes，抑制与使用 raw 类型相关的警告 //
// resource，抑制与使用 Closeable 类型的资源相关的警告 //
// restriction，抑制与使用不建议或禁止参照相关的警告 //
// serial，抑制与可序列化的类别遗漏 serialVersionUID 栏位相关的警告 //
// static-access，抑制与静态存取不正确相关的警告 //
// static-method，抑制与可能宣告为 static 的方法相关的警告 //
// super，抑制与置换方法相关但不含 super 呼叫的警告 //
// synthetic-access，抑制与内部类别的存取未最佳化相关的警告 //
// sync-override，抑制因为置换同步方法而遗漏同步化的警告 //
// unchecked，抑制与未检查的作业相关的警告 //
// unqualified-field-access，抑制与栏位存取不合格相关的警告 //
// unused，抑制与未用的程式码及停用的程式码相关的警告
//4.关于SuppressWarnings 作用范围和你放置的位置相关
   //如果放置在main方法上，那么抑制警告的范围就是main方法
// 通常我们可以放置具体的语句,方法，类

//5.源码：
//(1) 放置的位置就是 TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE
// (2) 该注解类有数组 String[] values() 设置一个数组比如 {"rawtypes", "unchecked", "unused"}
/*
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface SuppressWarnings {
String[] value();
}
 */




