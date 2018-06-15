<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>LoginPage</title>
</head>
<script language="javascript">
</script>
<body>
<form name="form1" method="get" action="../loginController">
  <table width="424" border="0" align="center">
    <tr bgcolor="#FF0000">
      <td colspan="2"><div align="center"><strong>Login Form </strong></div></td>
    </tr>
    <tr>
      <td colspan="2">&nbsp;</td>
    </tr>
    <tr>
      <td width="195">Login User Id </td>
      <td width="213"><input type="text" name="uidtxt" id="uidtxt"></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><input type="password" name="pswtxt" id="pswtxt"></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="Submit" value="Submit" onClick="showMsg();">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" name="Reset" value="Reset">
      </div></td>
    </tr>
  </table>
</form>
</body>
</html>