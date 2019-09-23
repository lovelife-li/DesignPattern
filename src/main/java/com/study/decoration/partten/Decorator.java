package com.study.decoration.partten;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-09-23 14:07
 */
@Data
public class Decorator extends Component {

    protected Component component;

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }


}
