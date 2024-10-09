<html>
<head>
<title> <h1>MACE FORM</h1> </title> 
</head>
 
 <body align = "center">
 <h1 style="color:purple" >STUDENT DATA</h1>
  <form align = "center" action ="form.php" method = "post">
  <table align = "center">
  
<tr>  <td>NA&nbspME:<td><input type= "text"></td></td></tr>
<tr> <td>  AGE:<td><input type= "text"name = "hello"> </td></td></tr>
<tr> <td>  Mob NO:<td><input type ="text"></td></td></tr>
<tr> <td><input type ="submit" name = "qwe" value = "ok"></td></tr>
<a href= "form.html">visit</a>
  </table>
  
  </form>
  
 </body>
</html>
<?php 
echo"php merging";
$t =$_POST['hello'];
echo "the value you entered =",$t;
?>
