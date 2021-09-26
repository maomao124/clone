/**
 * Project name(项目名称)：clone() 方法
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/26
 * Time(创建时间)： 19:30
 * Version(版本): 1.0
 * Description(描述)：
 * clone() 方法也可以实现复制数组。该方法是类 Object 中的方法，可以创建一个有单独内存空间的对象。
 * 因为数组也是一个 Object 类，因此也可以使用数组对象的 clone() 方法来复制数组。
 * clone() 方法的返回值是 Object 类型，要使用强制类型转换为适当的类型。其语法形式比较简单：
 * array_name.clone()
 * int[] targetArray=(int[])sourceArray.clone();
 * 注意：目标数组如果已经存在，将会被重构。
 * 有一个长度为 8 的 scores 数组，因为程序需要，现在要定义一个名称为 newScores 的数组来容纳 scores 数组中的所有元素，
 * 可以使用 clone() 方法来将 scores 数组中的元素全部复制到 newScores 数组中。代码如下：
 */

public class test
{
    public static void main(String[] args)
    {
        int[] score = new int[]{9, 8, 7, 5, 6, 5, 6, 8, 7, 25};
        System.out.println("原数组内容如下：");
        for (int i : score)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
        int[] newscores = (int[]) score.clone();
        System.out.println("目标数组内容如下:");
        for (int s : newscores)
        {
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
