<%@page import="model.bean.Vacxin"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/templates/admin/inc/header.jsp" %>
<div class="bottom-spacing">
	  <!-- Button -->
	  <div class="float-left">
		  <a href="<%=request.getContextPath()%>/admin/doVacxinThemMoi" class="button">
			<span>Thêm Vắcxin <img src="<%=request.getContextPath()%>/templates/admin/images/plus-small.gif" alt="Thêm Vắcxin"></span>
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
				ArrayList<Vacxin> listVX = new ArrayList<Vacxin>();
				listVX = (ArrayList<Vacxin>)request.getAttribute("listVacxin");
			%>
			<table id="myTable" class="tablesorter">
				<thead>
					<tr>
						<th style="width:10%; text-align: center;">Mã Vắcxin</th>
						<th style="width:20%">Tên Vắcxin</th>
						<th style="width:5%">Số mũi</th>
						<th style="width:20%">Mô tả</th>
						<th style="width:15%">Giá vắcxin</th>
						<th style="width:20%">Tên hãng</th>
						<th style="width:20%">Thao tác</th>
					</tr>
				</thead>
				<tbody>
					<%
						for(Vacxin vacxin:listVX){
							%>
								<tr>
									<td class="align-center"><%=vacxin.getMaVacxin()%></td>
									<td><%=vacxin.getTenVacxin()%></td>
									<td><%=vacxin.getSoMui()%></td>
									<td><%=vacxin.getMoTa()%></td>
									<td><%=vacxin.getGiaVacxin() %></td>
									<td><%=vacxin.getTenHang()%></td>
									<td align="center">
										<a href="<%=request.getContextPath()%>/admin/vacxin-cap-nhat?id=<%=vacxin.getMaVacxin()%>">Sữa<img src="<%=request.getContextPath()%>/templates/admin/images/pencil.gif" alt="edit" /></a>
										<a onClick = "return confirm('Bạn có thực sự xóa không ?')" href="<%=request.getContextPath()%>/admin/deleteVacxin?cid=<%=vacxin.getMaVacxin()%>">Xóa<img src="<%=request.getContextPath()%>/templates/admin/images/bin.gif" width="16" height="16" alt="delete" /></a>
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
				<span>|</span> 
				<a href="">4</a> 
				<span>|</span> 
				<a href="">5</a> 
				<span>|</span> 
				<a href="">6</a> 
				<span>|</span> 
				<a href="">7</a>
				<span>|</span> 
				<a href="">8</a> 
				<span>|</span> 
				<a href="">9</a>
				<span>|</span> 
				<a href="">10</a>   
			</div> 
			<div style="clear: both;"></div> 
		 </div>
</div> <!-- End .grid_12 -->
<%@include file="/templates/admin/inc/footer.jsp" %> 