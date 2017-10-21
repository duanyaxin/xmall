package cn.exrick.manager.service;

import cn.exrick.manager.pojo.TbBase;
import cn.exrick.manager.pojo.TbOrderItem;
import cn.exrick.manager.pojo.TbShiroFilter;

import java.util.List;

/**
 * @author Exrickx
 */
public interface SystemService {

    /**
     * 获得shiro过滤链配置
     * @return
     */
    List<TbShiroFilter> getShiroFilter();

    /**
     * 统计过滤链数目
     * @return
     */
    Long countShiroFilter();

    /**
     * 添加shiro过滤链
     * @param tbShiroFilter
     * @return
     */
    int addShiroFilter(TbShiroFilter tbShiroFilter);

    /**
     * 更新shiro过滤链
     * @param tbShiroFilter
     * @return
     */
    int updateShiroFilter(TbShiroFilter tbShiroFilter);

    /**
     * 删除shiro过滤链
     * @param id
     * @return
     */
    int deleteShiroFilter(int id);

    /**
     * 获取网站基础设置
     * @return
     */
    TbBase getBase();

    /**
     * 更新网站基础设置
     * @param tbBase
     * @return
     */
    int updateBase(TbBase tbBase);

    /**
     * 获取本周热销商品
     * @return
     */
    TbOrderItem getWeekHot();
}
