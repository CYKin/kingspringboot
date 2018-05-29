package com.king.utils;

import tk.mybatis.mapper.common.Mapper;
        import tk.mybatis.mapper.common.MySqlMapper;
/**
 * @author wangchangyong
 * @create 2018/05/24 9:48
 */
public interface BaseMapper<T> extends  Mapper<T>, MySqlMapper<T> {

    //FIXME 特别注意，该接口不能被扫描到，否则会出错

}
