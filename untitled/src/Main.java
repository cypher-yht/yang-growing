public class Main {
    //定义java文件署名类似书本封面包括了书名（class *name*）和作者（注释）
    /// 定义Java文件署名类似书本封面包括了书名（class *
    ///
    /// @author cypher
    /// @version 0.0.1
    /// # 一级标题
    /// - 内容1
    /// - 内容2
    public static  void main(String[] args)
    /*用于辨明文件类型暴露接口使jvm找到该文件并编译
    * 多行注释展示
    * 一般上文作者和版本用markdown和多行注释
    * 鼠标放在markdown注释处可以查看markdown格式
    */
    {
        System.out.println("Hello World");
        //用于输出hello world.
        VariablePractice it = new VariablePractice();
        it.intprintf(5);
        it.floatprintf(5);
        new Person();
        Person p1 = new Person();
        Person p3 = new Person();
        p1.name = "cypher";
        p1.age = 18;
        p1.printInfo();
        p1.hello();
        int result = p3.sum(10,20);
        System.out.println(result);

    }
}