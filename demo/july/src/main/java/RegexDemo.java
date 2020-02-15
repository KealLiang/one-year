import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lsr
 * @ClassName RegexDemo
 * @Date 2020-01-02
 * @Desc 正则测试
 * @Vertion 1.0
 */
public class RegexDemo {

    public static void main(String[] args) {
    /*
        Pattern 类：
        pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。

        Matcher 类：
        Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。

        PatternSyntaxException：
        PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。
    */

        Pattern pattern = Pattern.compile("(?<=A).*?(?=B)"); //.*?表示匹配任意字符，非贪婪模式
        Matcher matcher = pattern.matcher("1234AkkkB.someone loveAa-bBegin,Belong to A?");
//        if (matcher.find()) { // 这里必须先调用find，否则group方法会抛异常。注意：每find一次，matcher内部的指针就往下走了一段，不会回头
//            System.out.println(matcher.group());
//        }
        while (matcher.find()) { // 想返回全部结果时用while循环
            System.out.println(matcher.group());
        }
    }
}
