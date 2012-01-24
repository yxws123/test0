package com.kline.booking.service;

//import java.util.List;

import org.nutz.dao.QueryResult;

//import com.kline.booking.entity.BkgCargo;
import com.kline.booking.entity.BkgMaster;

/**
 * 
 * @author Wu Shuo
 *
 */

public interface BookingService {

	/**
	 * ��ҳ��ѯ
	 * 
	 * @param pageNumber ҳ��
	 * @param pageSize ÿҳ��¼��	
	 * @return QueryResult		
	 */
	public QueryResult findPage(String status, int pageNumber, int pageSize);

	// Booking
	public BkgMaster getBookingById(long bkgMasterId);
	public void insertBooking(BkgMaster bkgMaster);
	public void deleteBookingById(long bkgMasterId);

//	public void insertBkgMaster(BkgMaster bkgMaster);

	// BkgMaster
	public BkgMaster getBkgMasterById(long bkgMasterId);
	public void updateBkgMaster(BkgMaster bkgMaster);

	public BkgMaster getBkgMasterAById(long bkgMasterId);
	public void updateBkgMasterA(BkgMaster bkgMaster);

}
