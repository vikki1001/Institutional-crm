package com.ksv.ktrccrm.service;

import java.util.List;

import com.ksv.ktrccrm.db1.entities.RoleMenuActionAccess;

public interface RoleMenuActionAccessService {
	
	public List<RoleMenuActionAccess> getMenuListByModuleRoleMap(String TenantId, String roleCode, String isActive) throws Exception;

	public List<RoleMenuActionAccess> getAllMenusByRoleCode(String roleCode) throws Exception;
	
	public List<RoleMenuActionAccess> getRoleMenuActionAccessListByRoleCode(String roleCode) throws Exception;

	public void saveMenus(List<RoleMenuActionAccess> roleMenuActionAccess) throws Exception;
}
