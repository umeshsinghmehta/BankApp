<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>OpenAccResponse</title>
<!-- <link href="../css/style.css" type="text/css" rel="stylesheet"/> --> 
 <style type="text/css" >
 #response_container{
	width:700px;
	height:300px;
	margin:0;
 	padding:0;
	margin-top:50px;
	/* background-color:#33CCCC; */
	background-image:url("images/Form-background-medium.jpg");
	margin-left:150px;
	margin-right:80px;
 	background-position:center;	
} 
.tableBackgroundiage{
    width:700px;
	height:300px;
	background-image:url("../images/Form-background-medium.jpg");
	margin:0;
 	padding:0;
	margin-top:50px;
	margin-left:150px;
	margin-right:80px;
 	background-position:center;

}
.style5 {color: #FFFFFF}
.style4 {
	color: #FFFFFF;
	font-weight: bold;
	font-size: large;
}
</style> 

<script type="text/javascript">
function goBack()
{
	// Sets the new href (URL) for the current window.
	window.location.href = "jsp/NonAccHolderPage.jsp";
}

</script>
</head> 
<body>
<div id="response_container">
	<table width="613" border="0" align="center" cellpadding="2" cellspacing="3">
	  <tr>
		<td><div align="center"><span class="style4">Open Account Sussess Message </span></div></td>
	  </tr>
	  <tr>
		<td><span class="style5"></span></td>
	  </tr>
	  <tr>
		<td><span class="style5">Welcome :&nbsp;&nbsp;&nbsp;<%=request.getAttribute("userName") %> </span></td>
	  </tr>
	  <tr>
		<td><span class="style5">To open an account in Dream Bank Pvt Ltd. </span></td>
	  </tr>
	  <tr>
		<td><span class="style5">Your Account number is :&nbsp;&nbsp;&nbsp;<%=request.getAttribute("accNo") %> </span></td>
	  </tr>
	  <tr>
		<td><span class="style5"></span></td>
	  </tr>
	  <tr>
		<td><div align="center"><span class="style5">
		    <input type="button" name="Button" value="OK" onclick="goBack()">
	    </span></div></td>
	  </tr>
	  <tr>
		<td><span class="style5"></span></td>
	  </tr>
  </table>
</div>
</body>
</html>
