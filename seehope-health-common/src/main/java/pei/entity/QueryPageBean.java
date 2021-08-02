package pei.entity;

import java.io.Serializable;

/**
 * @program: seehope-health-common
 * @description 封装查询条件
 * @author: 彭于晏
 * @create: 2021-08-02 23:52
 **/
public class QueryPageBean implements Serializable {
    /**
     * 页码
     */
    private Integer currentPage;
    /**
     * 每页记录数
     */
    private Integer pageSize;
    /**
     * 查询条件
     */
    private String queryString;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }
}
