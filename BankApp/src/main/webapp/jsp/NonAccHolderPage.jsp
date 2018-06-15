<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Non-Account Holder Page</title>
<style type="text/css">
<!--
.style1 {color: #FFFFFF}
-->
</style>
</head>

<body>
<form name="form1" method="post" action="../CustomerController">
  <table width="591" border="0" align="center" cellpadding="3" cellspacing="5" background="../images/Form-background-medium.jpg">
    <tr>
      <td colspan="4"><div align="center" class="style1"><strong>Non Account Holder Form </strong></div></td>
    </tr>
    <tr>
      <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
      <td><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;First Name </span></td>
      <td><input name="fname" type="text" id="fname"></td>
      <td width="120"><span class="style1">Middle Name </span></td>
      <td width="149"><input name="mname" type="text" id="mname"></td>
    </tr>
    <tr>
      <td width="112"><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Last Name</span></td>
      <td colspan="3"><input name="lname" type="text" id="lname" size="40"></td>
    </tr>
    <tr>
      <td><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gender</span></td>
      <td width="147"><span class="style1">
        <input name="gender" type="radio" value="male">
        Male</span></td>
      <td colspan="2"><span class="style1">
        <input name="gender" type="radio" value="female"> 
      Female </span></td>
    </tr>
    <tr>
      <td><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;DoB</span></td>
      <td colspan="3"><input name="dob" type="text" id="dob"> 
        <span class="style1">&nbsp;&nbsp;(DD/MM/YYYY)</span></td>
    </tr>
    <tr>
      <td><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Address 1 </span></td>
      <td colspan="3"><input name="address" type="text" id="address" size="40"></td>
    </tr>
    <tr>
      <td><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;State</span></td>
      <td colspan="3"><select name="state">
	  <!-- <option value="">Select State</option> -->
	  <option value="RAJ">Rajasthan</option>	 
      </select></td>
    </tr>
    <tr>
      <td><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;City</span></td>
      <td colspan="3"><select name="city" id="city">
	     <!-- <option value="">Select City</option> -->
	     <option value="JPR">Jaipur</option>
		 <option value="KTA">Kota</option>
		 <option value="UDP">Udaipur</option>
		 <option value="AJM">Ajmer</option>
		 <option value="JDR">Jodhpur</option>
      </select></td>
    </tr>
    <tr>
      <td><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PinCode</span></td>
      <td colspan="3"><input name="pincode" type="text" id="pincode" size="40" maxlength="20"></td>
    </tr>
    <tr>
      <td><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PAN No. </span></td>
      <td colspan="3"><input name="pan" type="text" id="pan" size="40" maxlength="10"></td>
    </tr>
    <tr>
      <td><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;AddharNo</span></td>
      <td colspan="3"><input name="addhar" type="text" id="addhar" size="40"></td>
    </tr>
    <tr>
      <td><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Mobile</span></td>
      <td colspan="3"><input name="mobile" type="text" id="mobile" size="40"></td>
    </tr>
    <tr>
      <td><span class="style1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email</span></td>
      <td colspan="3"><input name="email" type="text" id="email" size="50"></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td colspan="3">&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td colspan="3">&nbsp;</td>
    </tr>
    <tr>
      <td colspan="4"><div align="center">
        <input type="submit" name="Submit" value="Submit">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;        
<input type="reset" name="Reset" value="Reset">
      </div></td>
    </tr>
    <tr>
      <td colspan="4">&nbsp;</td>
    </tr>
  </table>
</form>
</body>
</html>
