<%@page import="model.bean.KhachHang"%>
<%@page import="model.bean.Vacxin"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/templates/admin/inc/header.jsp" %>
<div class="bottom-spacing">
	  <!-- Button -->
	  <div class="float-left">
		  <a href="<%=request.getContextPath()%>/admin/doKhachHangThemMoi" class="button">
			<span>Thêm Khách hàng <img src="<%=request.getContextPath()%>/templates/admin/images/plus-small.gif" alt="Thêm Vắcxin"></span>
		  </a>
	  </div>
	  <div class="clear"></div>
</div>

<div class="grid_12">
	<!-- Example table -->
	<div class="module">
		<h2><span>Danh sách vắcxin</span></h2>
		<div class="module-table-body">
			<form action="">
			<%
				ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
				listKH = (ArrayList<KhachHang>)request.getAttribute("listKH");
			%>
			<table id="myTable" class="tablesorter">
				<thead>
					<tr>
						<th style="width:10%; text-align: center;">Mã Khách hàng</th>
						<th style="width:20%">Họ và tên</th>
						<th style="width:5%">Số điện thoại</th>
						<th style="width:20%">Địa chỉ</th>
						<th style="width:15%">Ngày sinh</th>
						<th style="width:10%">Giới tính</th>
						<th style="width:20%">Thao tác</th>
					</tr>
				</thead>
				<tbody>
					<%
						for(KhachHang khachHang:listKH){
							%>
								<tr>
									<td class="align-center"><%%><%=khachHang.getMaKH()%></td>
									<td><%=khachHang.getHoTenKH()%></td>
									<td><%=khachHang.getSoDienThoai()%></td>
									<td><%=khachHang.getDiaChiKH()%></td>
									<td><%=khachHang.getNgaySinh()%></td>
									<td><%=khachHang.getGioiTinh()%></td>
									<td align="center">
										<a href="<%=request.getContextPath()%>/admin/chi-tiet-lich-su-tiem-chung?id=<%=khachHang.getMaKH()%>">Chi tiết<img src="<%=request.getContextPath()%>/templates/admin/images/pencil.gif" alt="edit" /></a>
										<a onClick = "return confirm('Bạn có thực sự xóa không ?')" href="<%=request.getContextPath()%>/admin/deleteVacxin?cid=<%=khachHang.getMaKH()%>">Chi phí<img src="<%=request.getContextPath()%>/templates/admin/images/bin.gif" width="16" height="16" alt="delete" /></a>
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