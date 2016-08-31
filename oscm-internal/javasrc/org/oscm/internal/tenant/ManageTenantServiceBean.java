/*******************************************************************************
 *
 *  Copyright FUJITSU LIMITED 2016
 *
 *  Creation Date: 30.08.2016
 *
 *******************************************************************************/
package org.oscm.internal.tenant;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import org.oscm.interceptor.ExceptionMapper;
import org.oscm.interceptor.InvocationDateContainer;
import org.oscm.internal.intf.TenantService;
import org.oscm.internal.vo.VOTenant;

@Stateless
@Remote(ManageTenantService.class)
@Interceptors({ InvocationDateContainer.class, ExceptionMapper.class })
public class ManageTenantServiceBean implements ManageTenantService {

    @EJB
    TenantService tenantService;

    @Override
    public List<POTenant> getAllTenants() {
        List<POTenant> poTenants = new ArrayList<>();
        for (VOTenant voTenant : tenantService.getTenants()) {
            poTenants.add(new POTenant(voTenant));
        }
        return poTenants;
    }

}
