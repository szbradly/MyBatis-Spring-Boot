package tk.mybatis.springboot.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "sms_flash_promotion_product_relation")
public class SmsFlashPromotionProductRelation {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "flash_promotion_id")
    private Long flashPromotionId;

    /**
     * 编号
     */
    @Column(name = "flash_promotion_session_id")
    private Long flashPromotionSessionId;

    @Column(name = "product_id")
    private Long productId;

    /**
     * 限时购价格
     */
    @Column(name = "flash_promotion_price")
    private BigDecimal flashPromotionPrice;

    /**
     * 限时购数量
     */
    @Column(name = "flash_promotion_count")
    private Integer flashPromotionCount;

    /**
     * 每人限购数量
     */
    @Column(name = "flash_promotion_limit")
    private Integer flashPromotionLimit;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return flash_promotion_id
     */
    public Long getFlashPromotionId() {
        return flashPromotionId;
    }

    /**
     * @param flashPromotionId
     */
    public void setFlashPromotionId(Long flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    /**
     * 获取编号
     *
     * @return flash_promotion_session_id - 编号
     */
    public Long getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    /**
     * 设置编号
     *
     * @param flashPromotionSessionId 编号
     */
    public void setFlashPromotionSessionId(Long flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
    }

    /**
     * @return product_id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取限时购价格
     *
     * @return flash_promotion_price - 限时购价格
     */
    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    /**
     * 设置限时购价格
     *
     * @param flashPromotionPrice 限时购价格
     */
    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    /**
     * 获取限时购数量
     *
     * @return flash_promotion_count - 限时购数量
     */
    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    /**
     * 设置限时购数量
     *
     * @param flashPromotionCount 限时购数量
     */
    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    /**
     * 获取每人限购数量
     *
     * @return flash_promotion_limit - 每人限购数量
     */
    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    /**
     * 设置每人限购数量
     *
     * @param flashPromotionLimit 每人限购数量
     */
    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}