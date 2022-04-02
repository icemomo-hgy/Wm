package com.wm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wm.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;
import org.apache.tomcat.jni.Address;
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
