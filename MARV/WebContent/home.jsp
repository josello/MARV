<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>MARV - home</title>
	<base href="<%= request.getContextPath() %>" />
</head>
<body>
	<a href="?command=Institution">Add Institution</a>
	<a href="?command=ListInstitutions">List Institutions</a>
	<a href="?command=User">Add User</a>
	<a href="?command=ListAuctionCategories">List Auction Categories</a>
</body>
</html>
