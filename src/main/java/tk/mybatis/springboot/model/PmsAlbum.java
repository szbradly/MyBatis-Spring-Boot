package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "pms_album")
public class PmsAlbum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "cover_pic")
    private String coverPic;

    @Column(name = "pic_count")
    private Integer picCount;

    private Integer sort;

    private String description;

    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return cover_pic
     */
    public String getCoverPic() {
        return coverPic;
    }

    /**
     * @param coverPic
     */
    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    /**
     * @return pic_count
     */
    public Integer getPicCount() {
        return picCount;
    }

    /**
     * @param picCount
     */
    public void setPicCount(Integer picCount) {
        this.picCount = picCount;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return shop_id
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}