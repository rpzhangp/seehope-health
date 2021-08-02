package pei.pojo;

import java.io.Serializable;
import java.util.List;


/**
 * 体检套餐
 * @author rushuni
 * @date 2021/7/31
 */
public class Setmeal implements Serializable {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 编码
     */
    private String code;
    /**
     * 帮助编码
     */
    private String helpCode;
    /**
     * 套餐适用性别：0不限 1男 2女
     */
    private String sex;
    /**
     * 套餐适用年龄
     */
    private String age;
    /**
     * 套餐价格
     */
    private Float price;
    /**
     * 备注
     */
    private String remark;
    /**
     * 提醒
     */
    private String attention;
    /**
     * 套餐对应图片存储路径
     */
    private String img;
    /**
     * 套餐适用年龄
     */
    private List<CheckGroup> checkGroups;

    public List<CheckGroup> getCheckGroups() {
        return checkGroups;
    }
    public void setCheckGroups(List<CheckGroup> checkGroups) {
        this.checkGroups = checkGroups;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHelpCode() {
        return helpCode;
    }

    public void setHelpCode(String helpCode) {
        this.helpCode = helpCode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
