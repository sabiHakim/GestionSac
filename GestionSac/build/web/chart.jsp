<%@ page import="model.*,java.util.*" %>

<%
String id_type = request.getParameter("id_type");
try{
Integer.parseInt(id_type);
} catch(Exception e) {
    response.sendRedirect("getStat.jsp");
}
int homme = Statistique.getNombre(Integer.parseInt(id_type), 1);
int femme = Statistique.getNombre(Integer.parseInt(id_type), 2);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Diagramme en Camembert</title>
    <!-- <script src="https://cdn.jsdelivr.net/npm/chart.js"></script> -->
    <script  src="chart.js"></script>
    
    <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Tables / Data - NiceAdmin Bootstrap Template</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.snow.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.bubble.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/simple-datatables/style.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">
</head>
<body>
    <div>
        <table class="table datatable">
                <thead>
                  <tr>
                    <th scope="col">Homme</th>
                    <th scope="col">Femme</th>
                    <th scope="col">Total</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td><%= homme %></td>
                    <td><%=femme%></td>
                    <td><%= homme + femme%></td>
                  </tr>
                </tbody>
                
            </table>
    </div>
    <div><canvas id="myChart" width="400" height="400"></canvas></div>
    <script>
        var ctx = document.getElementById('myChart').getContext('2d');
        var myChart = new Chart(ctx, {
            type: 'doughnut',
            data: {
                labels: ['Hommes', 'Femmes'],
                datasets: [{
                    label: 'R?partition Hommes/Femmes',
                    data: [<%= homme %>, <%=femme%>],
                    backgroundColor: [
                        'rgba(255, 99, 132, 0.5)',
                        'rgba(54, 162, 235, 0.5)'
                    ],
                    borderColor: [
                        'rgba(255, 99, 132, 1)',
                        'rgba(54, 162, 235, 1)'
                    ],
                    borderWidth: 1
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false
            }
        });
    </script>
</body>
</html>
