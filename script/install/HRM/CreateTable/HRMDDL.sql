USE `MISPDB`;


DROP TABLE IF EXISTS `hrm_gas_business`;
CREATE TABLE `hrm_gas_business` (
	`GAS_ID` varchar(20) NOT NULL COMMENT '��֯����ID' ,
	`DATE_MONTH` date NOT NULL COMMENT 'ʱ�䣨�£�' ,
	`CARD_PROPORTION` float DEFAULT NULL COMMENT '����վ�ֿ�����' ,
`OIL_SALES_VOLUME` float DEFAULT NULL COMMENT '��վ��������/��' ,
  PRIMARY KEY (`GAS_ID`,`DATE_MONTH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
