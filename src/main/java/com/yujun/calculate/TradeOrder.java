package com.yujun.calculate;

import java.util.Map;

import com.yujun.domain.OnlinePriceDO;
import com.yujun.domain.StockDO;

public interface TradeOrder {
	public Map<String,StockDO> calculate(StockDO initStock, StockDO hoding, OnlinePriceDO online);
}
