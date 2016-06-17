<%@page import="model.bean.Vacxin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/templates/admin/inc/header.jsp" %>
<!-- Form elements -->    
<div class="grid_12">

	<div class="module">
		 <h2><span style="font-size:18px">Cập nhật vắc xin</span></h2>
		 <%
		 	Vacxin vacxin = new Vacxin();
		 	vacxin = (Vacxin)request.getAttribute("vacxin");
		 %>
		 <div class="module-body">
			<form action="<%=request.getContextPath()%>/admin/doVacxinCapNhat?id=<%=vacxin.getMaVacxin()%>" method = "post" id="frmeditvacxin">
				<p>
					<label>Mã Vắcxin</label>
					<input type="text" name="maVacxin" value="<%=vacxin.getMaVacxin()%>" class="input-medium" disabled/>
				</p>
				<p>
					<label>Tên Vắcxin</label>
					<input type="text" name="tenVacxin" value="<%=vacxin.getTenVacxin()%>" class="input-medium"/>
				</p>
				<p>
					<label>Số mũi</label>
					<input type="number" name="soMui" value="<%=vacxin.getSoMui()%>" class="input-medium"/>
				</p>
				<p>
					<label>Mô tả</label>
					<textarea name="moTa" rows="7" cols="90" class="input-medium"><%=vacxin.getMoTa()%></textarea>
				</p>
				<p>
					<label>Giá Vắcxin</label>
					<input type="number" name="giaVacxin" value="<%=vacxin.getGiaVacxin()%>" class="input-medium"/>
				</p>
				<p>
					<label>Tên Hãng</label>
					<input type="text" name="tenHang" value="<%=vacxin.getTenHang()%>" class="input-medium"/>
				</p>
				<fieldset>
					<input class="submit-green" name="capnhat" type="submit" value="Cập Nhật" /> 
					<input class="submit-gray" name="reset" type="reset" value="Nhập lại" />
				</fieldset>
			</form>
			<!--  Bắt validate trường rỗng -->
			<script>
			$(document).ready(function(){
        		$('#frmeditvacxin').validate({
        			rules:{
        					tenVacxin:{
        						required:true,
        						minlength:2,
        						maxlength:12
        					},
        					soMui:{
        						required:true,
        						minlength:1,
        						maxlength:100
        					},
        					moTa:{
        						required:true,
        						minlength:1
        					},
        					giaVacxin:{
        						required:true,
        						minlength:1
        					},
        					tenHang:{
        						required:true,
        						minlength:1,
        						maxlength:255
        					}
        				},
        			messages:{
        					tenVacxin:{
        						required:"<p style = 'color:red'>Please do not blank field tên vắc xin !</p>"
        					},
        					soMui:{
        						required:"<p style = 'color:red'>Please do not blank field số mũi tiêm !</p>"
        					},
        					moTa:{
        						required:"<p style = 'color:red'>Please do not blank field mô tả !</p>"
        					},
							giaVacxin:{
								required:"<p style = 'color:red'>Please do not blank field giá vắc xin !</p>"
        					},
        					tenHang:{
        						required:"<p style = 'color:red'>Please do not blank field tên Hãng !</p>"
        					}
        			}
        		});
        	});	
			</script>
		 </div> <!-- End .module-body -->
	</div>  <!-- End .module -->
	<div style="clear:both;"></div>
</div> <!-- End .grid_12 -->
<%@include file="/templates/admin/inc/footer.jsp" %> 