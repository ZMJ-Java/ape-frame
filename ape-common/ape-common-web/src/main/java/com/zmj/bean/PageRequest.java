package com.zmj.bean;

import lombok.Data;
import lombok.Setter;

/**
 * @author ZMJ
 * @Package com.zmj.bean
 * @date 2022/9/17 7:52
 */
@Setter
public class PageRequest {

    private Long pageNo = 1L;

    private Long pageSize = 10L;

    public Long getPageNo() {
        if (pageNo == null || pageNo < 1) {
            return 1L;
        }
        return pageNo;
    }

    public Long getPageSize() {
        if (pageSize == null || pageSize < 1 || pageSize > Integer.MAX_VALUE) {
            return 10L;
        }
        return pageSize;
    }
}
