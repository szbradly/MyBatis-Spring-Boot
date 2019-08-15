package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_info")
public class ShopInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date created;

    @Column(name = "last_login")
    private Date lastLogin;

    private Integer status;

    /**
     * 0免费1付费
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return last_login
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * @param lastLogin
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取0免费1付费
     *
     * @return pay_type - 0免费1付费
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置0免费1付费
     *
     * @param payType 0免费1付费
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }
}