package com.study.decoration.partten;

/**
 * @author ldb
 * @date 2019-09-23 14:06
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象操作");
    }
}
