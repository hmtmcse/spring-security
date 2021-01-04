package com.hmtmcse.ss.springsecurity.modules.system.dto.output;

import com.google.common.collect.Lists;
import com.hmtmcse.ss.springsecurity.modules.system.entity.Menu;
import lombok.Data;

import java.util.List;

/**
 *  <p> 菜单树节点 </p>
 *
 * @description :
 * @author : zhengqing
 * @date : 2019/8/19 18:54
 */
@Data
public class MenuTreeNode extends Menu {

    List<MenuTreeNode> children = Lists.newArrayList();

}
