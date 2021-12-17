package com.whackon.addrook.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.addrook.pojo.entity.Addrook;
import org.springframework.stereotype.Repository;

/**
 * <b>个人通讯录系统 - 数据持久层</b>
 *
 * @author user
 * @date 2021/12/17
 * @version 6.0.0
 */
@Repository("addrookDao")
public interface AddrookDao extends BaseMapper<Addrook> {
}
