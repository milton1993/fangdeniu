<html>
<head>
    <script type="text/javascript" src="jquery-1.7.2.min.js"></script>
    <script type="text/javascript" >
        $(document).ready(function() {
            $.post("/test", {}, function(data) {
                alert(data.message.split('    ')[0].split(": ")[1]);
            });
        });
    </script>
</head>
<body>
<h2>Hello World!</h2>
</body>
</html>
