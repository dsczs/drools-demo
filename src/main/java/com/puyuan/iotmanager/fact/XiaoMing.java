package com.puyuan.iotmanager.fact;

import lombok.Data;

/**
 * This class was automatically generated by the data modeler tool.
 */

@Data
public class XiaoMing implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label("拥有的钱")
    private java.lang.Integer money;
    @org.kie.api.definition.type.Label("空瓶子数量")
    private java.lang.Integer bottle;
    @org.kie.api.definition.type.Label("已经喝掉的汽水")
    private java.lang.Integer drink;

    public XiaoMing() {

    }

    public XiaoMing(java.lang.Integer money, java.lang.Integer bottle,
                    java.lang.Integer drink) {
        this.money = money;
        this.bottle = bottle;
        this.drink = drink;
    }

}