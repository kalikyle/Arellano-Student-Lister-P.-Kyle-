Imports MySql.Data.MySqlClient


Public Class connectsql

        Private connection As New MySqlConnection("Data Source=localhost; Initial Catalog=loginform;User ID=root;Password=;Connection Timeout=50;")


        ReadOnly Property getConnection() As MySqlConnection
            Get
                Return connection

            End Get
        End Property

        Sub openConnection()
            If connection.State = ConnectionState.Closed Then
                connection.Open()
            End If
        End Sub
        Sub closeConnection()


            If connection.State = ConnectionState.Open Then
                connection.Close()
            End If
        End Sub
    End Class
