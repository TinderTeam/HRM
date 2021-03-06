USE `MISPDB`;


DROP TABLE IF EXISTS `hrm_gas_business`;
CREATE TABLE `hrm_gas_business` (
	`GAS_ID` varchar(20) NOT NULL COMMENT '组织机构ID' ,
	`DATE_MONTH` date NOT NULL COMMENT '时间（月）' ,
	`CARD_PROPORTION` float DEFAULT NULL COMMENT '加油站持卡比例' ,
`OIL_SALES_VOLUME` float DEFAULT NULL COMMENT '油站销量（吨/月' ,
  PRIMARY KEY (`GAS_ID`,`DATE_MONTH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
