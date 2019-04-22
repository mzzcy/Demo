package com.mz.mybatis.mapper;

import com.mz.mybatis.po.Role;

/**
 * @author zzwor
 * @date 2019/4/20
 **/
public interface RoleMapper {
  public Role getRole(Long id);
  public int deleteRole(Long id);
  public int insertRole(Role role);

}
