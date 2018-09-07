package com.example.lib;

//静态代理模式
public class StaticProxy {
    public static void main(String[] args) {
        //创建真实角色
        You you = new You();
        //创建代理角色（没有新增方法可以使用接口定义）+真实角色的引用
        WeddingCompany company = new WeddingCompany(you);
        //执行任务
        company.marry();

    }

}
interface Marry{
    void marry(); //空方法
}

//真实角色
class You implements Marry{

    @Override
    public void marry() {
        System.out.println("you marrying");
    }
}

//代理角色
class WeddingCompany implements Marry{
    private Marry you;
    //无参构造
    public WeddingCompany(){

    }
    //带参构造
    public WeddingCompany(Marry you){
        this.you = you;
    }

    private void before(){
        System.out.println("beginnig....");
    }
    private void after(){
        System.out.println("finish....");
    }

    @Override
    public void marry() {
        before();
        you.marry();
        after();
    }
}
