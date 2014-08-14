USE `mispdb`;
INSERT INTO `s_system_menu`(MENU_ID,NAME,VALUE,TYPE,ICON,EXTENAL,FRESH,URL,PARENT_ID,FUNCTION_ID) VALUES (90000,'SystemConfig','系统设置','','icon icon-home','','','#',0,1);
INSERT INTO `s_system_menu`(MENU_ID,NAME,VALUE,TYPE,ICON,EXTENAL,FRESH,URL,PARENT_ID,FUNCTION_ID) VALUES (91000,'userManage','用户管理','','icon icon-home','','','userManage.action',90000,1);
INSERT INTO `s_system_menu`(MENU_ID,NAME,VALUE,TYPE,ICON,EXTENAL,FRESH,URL,PARENT_ID,FUNCTION_ID) VALUES (92000,'groupManage','用户组管理','','icon icon-home','','','groupManage.action',90000,1);
INSERT INTO `s_system_menu`(MENU_ID,NAME,VALUE,TYPE,ICON,EXTENAL,FRESH,URL,PARENT_ID,FUNCTION_ID) VALUES (93000,'orgManage','组织机构管理','','icon icon-home','','','orgManage.action',90000,1);
INSERT INTO `s_system_menu`(MENU_ID,NAME,VALUE,TYPE,ICON,EXTENAL,FRESH,URL,PARENT_ID,FUNCTION_ID) VALUES (20000,'PersonalConfig','个人设置','','icon icon-home','','','#',0,1);
INSERT INTO `s_system_menu`(MENU_ID,NAME,VALUE,TYPE,ICON,EXTENAL,FRESH,URL,PARENT_ID,FUNCTION_ID) VALUES (21000,'password','信息/密码修改','','icon icon-home','','','passwordConfig.action',20000,1);
INSERT INTO `s_system_menu`(MENU_ID,NAME,VALUE,TYPE,ICON,EXTENAL,FRESH,URL,PARENT_ID,FUNCTION_ID) VALUES (10000,'shiftManage','加油站排班管理','','icon icon-home','','','shiftManage.action',0,1);
INSERT INTO `s_system_menu`(MENU_ID,NAME,VALUE,TYPE,ICON,EXTENAL,FRESH,URL,PARENT_ID,FUNCTION_ID) VALUES (10001,'shiftConfig','排班参数设置','','icon icon-home','','','shiftConfig.action',10000,1);
INSERT INTO `s_system_menu`(MENU_ID,NAME,VALUE,TYPE,ICON,EXTENAL,FRESH,URL,PARENT_ID,FUNCTION_ID) VALUES (10002,'shift','本月排班操作','','icon icon-home','','','shift.action',10000,1);
INSERT INTO `s_system_menu`(MENU_ID,NAME,VALUE,TYPE,ICON,EXTENAL,FRESH,URL,PARENT_ID,FUNCTION_ID) VALUES (10003,'shiftSearch','排班查询','','icon icon-home','','','shiftSearch.action',10000,1);
INSERT INTO `s_system_menu`(MENU_ID,NAME,VALUE,TYPE,ICON,EXTENAL,FRESH,URL,PARENT_ID,FUNCTION_ID) VALUES (10004,'shiftAudite','本月排班审核','','icon icon-home','','','shiftAudite.action',10000,1);

