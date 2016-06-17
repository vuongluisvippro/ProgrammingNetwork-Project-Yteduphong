<%@page import="model.bean.Objectx"%>
<%@page import="model.bean.KhachHang"%>
<%@page import="model.bean.Vacxin"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/templates/admin/inc/header.jsp" %>
<div class="bottom-spacing">
	  <!-- Button -->
	  <div class="clear"></div>
</div>

<div class="grid_12">
	<!-- Example table -->
	<div class="module">
		<h2><span>Xem lịch sử tiêm chủng cá nhân</span></h2>
		<div class="module-table-body">
			<form action="">
			<%
				ArrayList<Objectx> listObjx = new ArrayList<Objectx>();
				listObjx = (ArrayList<Objectx>)request.getAttribute("listObjx");
			%>
			<table id="myTable" class="tablesorter">
				<thead>
					<tr>
						<th style="width:10%; text-align: center;">Mã Khách hàng</th>
						<th style="width:20%">Tên Khách Hàng</th>
						<th style="width:20%">Tên Bệnh</th>
						<th style="width:20%">Mã Vắcxin</th>
						<th style="width:15%">Tên Vắcxin</th>
						<th style="width:10%">Tổng số mũi cần phải tiêm</th>
					</tr>
				</thead>
				<tbody>
				<%
					for(Objectx x : listObjx){
				%>
								<tr>
									<td class="align-center"><%=x.getMaKH()%></td>
									<td><%=x.getTenKhachHang()%></td>
									<td><%=x.getTenBenh()%></td>
									<td><%=x.getMaVacxin()%></td>
									<td><%=x.getTenVacxin()%></td>
									<td><%
											int temp = x.getTongSoMui() - x.getSttMui();
											out.print(temp);
										%>
									</td>
								</tr>
				<%
					}
				%>
				</tbody>
			</table>
			</form>
		 </div> <!-- End .module-table-body -->
	</div> <!-- End .module -->
		 <div class="pagination">           
			<div class="numbers">
				<span>Trang:</span> 
				<a href="">1</a> 
				<span>|</span> 
				<a href="">2</a> 
				<span>|</span> 
				<span class="current">3</span> 
			</div> 
			<div style="clear: both;"></div> 
		 </div>
</div> <!-- End .grid_12 -->
<%@include file="/templates/admin/inc/footer.jsp" %> 