package com.office.attendance.controller.infra.impl;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.attendance.domain.dto.Dto;
import com.office.attendance.infra.repository.IAttendace;
import com.office.attendance.infra.response.AttendanceResponse;
import com.office.attendance.infra.response.GetAttendanceResponse;
import com.office.attendance.infra.response.GetAttendanceResponseList;

@Service
public class IDBCallImpl implements IDBCall {
	private IAttendace iAttendace;

	
	@Autowired
	public IDBCallImpl(IAttendace iAttendace) {
		super();
		this.iAttendace = iAttendace;
	}



	@Override
	public Dto saveAttendance(Dto dto) {
		// TODO Auto-generated method stub
		iAttendace.save(dto.getAttendance());
		AttendanceResponse a = new AttendanceResponse();
		a.setStatus("Attendance Filled Successfully");
		dto.setAttendanceResponse(a);;
		return dto;
	}



	@Override
	public Dto getEmployeeAttendanceDBCall(Dto dto) {
		LocalDate currentDate = LocalDate.now();
		LocalDate dateMinusThreeMonths = currentDate.minus(Period.ofMonths(12));
		ArrayList<GetAttendanceResponse> getAttendanceResponseList = iAttendace.getEmployeeAttendance(dto.getGetEmployeeAttendanceRequest().getEmployeeRef(), dateMinusThreeMonths,currentDate );
		GetAttendanceResponseList getAttendanceResponseList2 = new GetAttendanceResponseList();
		getAttendanceResponseList2.setGetAttendanceResponseList(getAttendanceResponseList);
		dto.setGetAttendanceResponseList(getAttendanceResponseList2);
		return dto;
	}

}
