﻿USE `mispdb`;
INSERT INTO `d_org`(ORG_ID,ORG_NAME,ORG_TYPE,ORG_DESP,PARENT_ID) VALUES ('DG-HQ-00001','东莞公司',11,NULL,NULL);
INSERT INTO `d_org`(ORG_ID,ORG_NAME,ORG_TYPE,ORG_DESP,PARENT_ID) VALUES ('DG-HQ-01000','人力资源管理部',13,NULL,'DG-HQ-0001');
INSERT INTO `d_org`(ORG_ID,ORG_NAME,ORG_TYPE,ORG_DESP,PARENT_ID) VALUES ('DG-BM-02000','东城经营管理部',15,NULL,'DG-HQ-0001');
INSERT INTO `d_org`(ORG_ID,ORG_NAME,ORG_TYPE,ORG_DESP,PARENT_ID) VALUES ('DG-BM-02001','虎门经营管理部',15,NULL,'DG-HQ-0001');
INSERT INTO `d_org`(ORG_ID,ORG_NAME,ORG_TYPE,ORG_DESP,PARENT_ID) VALUES ('DG-GS-03001','中穗加油站',18,NULL,'DG-BM-02000');
INSERT INTO `d_org`(ORG_ID,ORG_NAME,ORG_TYPE,ORG_DESP,PARENT_ID) VALUES ('DG-GS-03002','四环中加油站',18,NULL,'DG-BM-02000');
INSERT INTO `d_org`(ORG_ID,ORG_NAME,ORG_TYPE,ORG_DESP,PARENT_ID) VALUES ('DG-GS-03003','桥南加油站',18,NULL,'DG-BM-02001');


