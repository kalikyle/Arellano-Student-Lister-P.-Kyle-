Imports System.Data.OleDb
Imports Microsoft.VisualBasic
Public Class Form1
    Private Sub Students2BindingNavigatorSaveItem_Click(sender As Object, e As EventArgs)
        Me.Validate()
        Me.Students2BindingSource.EndEdit()
        Me.TableAdapterManager.UpdateAll(Me.Students4DataSet2)

    End Sub

    Private Sub Form3_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: This line of code loads data into the 'Students4DataSet2.students2' table. You can move, or remove it, as needed.
        Me.Students2TableAdapter.Fill(Me.Students4DataSet2.students2)

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Students2BindingSource.AddNew()
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Students2BindingSource.EndEdit()
        Students2TableAdapter.Update(Students4DataSet2.students2)
        MsgBox("SAVED", vbOKOnly)
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        Students2BindingSource.RemoveCurrent()
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        OpenFileDialog1.ShowDialog()
        pic.Text = OpenFileDialog1.FileName
    End Sub

    Private Sub pic_TextChanged(sender As Object, e As EventArgs) Handles pic.TextChanged
        If (System.IO.File.Exists(pic.Text)) Then
            Pic1.Image = Image.FromFile(pic.Text)
        End If
        If pic.Text = "" Then
            Pic1.Hide()
        Else
            Pic1.Show()
        End If
    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs)

    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) 
        Dim conn As New OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=|DataDirectory|\students4.accdb")

        If conn.State = ConnectionState.Closed Then
            conn.Open()
        End If
        Dim cmd1 As New OleDbCommand("select * from students2 where Name like '%" + TextBox1.Text + "%'", conn)

        Dim da As New OleDbDataAdapter
        Dim dt As New DataTable

        da.SelectCommand = cmd1

        dt.Clear()
        da.Fill(dt)

        Students2DataGridView.DataSource = dt

        Students2DataGridView.Columns(0).HeaderText = "Name"
        Students2DataGridView.Columns(1).HeaderText = "Middle_Name"
        Students2DataGridView.Columns(2).HeaderText = "Surname"
        Students2DataGridView.Columns(3).HeaderText = "Section"
        Students2DataGridView.Columns(4).HeaderText = "Students_Number"
        Students2DataGridView.Columns(5).HeaderText = "Contact_Number"
        Students2DataGridView.Columns(6).HeaderText = "Email"
        Students2DataGridView.Columns(7).HeaderText = "Age"
        Students2DataGridView.Columns(8).HeaderText = "Gender"

        conn.Close()
    End Sub

    Private Sub TextBox2_TextChanged(sender As Object, e As EventArgs) 
        Dim conn As New OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=|DataDirectory|\students4.accdb")

        If conn.State = ConnectionState.Closed Then
            conn.Open()
        End If
        Dim cmd1 As New OleDbCommand("select * from students2 where [Section] like '%" + TextBox2.Text + "%'", conn)

        Dim da As New OleDbDataAdapter
        Dim dt As New DataTable

        da.SelectCommand = cmd1

        dt.Clear()
        da.Fill(dt)

        Students2DataGridView.DataSource = dt

        Students2DataGridView.Columns(0).HeaderText = "Name"
        Students2DataGridView.Columns(1).HeaderText = "Middle_Name"
        Students2DataGridView.Columns(2).HeaderText = "Surname"
        Students2DataGridView.Columns(3).HeaderText = "Section"
        Students2DataGridView.Columns(4).HeaderText = "Students_Number"
        Students2DataGridView.Columns(5).HeaderText = "Contact_Number"
        Students2DataGridView.Columns(6).HeaderText = "Email"
        Students2DataGridView.Columns(7).HeaderText = "Age"
        Students2DataGridView.Columns(8).HeaderText = "Gender"

        conn.Close()
    End Sub

    Private Sub TextBox3_TextChanged(sender As Object, e As EventArgs) 
        Dim conn As New OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=|DataDirectory|\students4.accdb")

        If conn.State = ConnectionState.Closed Then
            conn.Open()
        End If
        Dim cmd1 As New OleDbCommand("select * from students2 where  Age like '%" + TextBox3.Text + "%'", conn)

        Dim da As New OleDbDataAdapter
        Dim dt As New DataTable

        da.SelectCommand = cmd1

        dt.Clear()
        da.Fill(dt)

        Students2DataGridView.DataSource = dt

        Students2DataGridView.Columns(0).HeaderText = "Name"
        Students2DataGridView.Columns(1).HeaderText = "Middle_Name"
        Students2DataGridView.Columns(2).HeaderText = "Surname"
        Students2DataGridView.Columns(3).HeaderText = "Section"
        Students2DataGridView.Columns(4).HeaderText = "Students_Number"
        Students2DataGridView.Columns(5).HeaderText = "Contact_Number"
        Students2DataGridView.Columns(6).HeaderText = "Email"
        Students2DataGridView.Columns(7).HeaderText = "Age"
        Students2DataGridView.Columns(8).HeaderText = "Gender"

        conn.Close()
    End Sub

    Private Sub TextBox4_TextChanged(sender As Object, e As EventArgs) 
        Dim conn As New OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=|DataDirectory|\students4.accdb")

        If conn.State = ConnectionState.Closed Then
            conn.Open()
        End If
        Dim cmd1 As New OleDbCommand("select * from students2 where [Students Number] like '%" + TextBox4.Text + "%'", conn)

        Dim da As New OleDbDataAdapter
        Dim dt As New DataTable

        da.SelectCommand = cmd1

        dt.Clear()
        da.Fill(dt)

        Students2DataGridView.DataSource = dt

        Students2DataGridView.Columns(0).HeaderText = "Name"
        Students2DataGridView.Columns(1).HeaderText = "Middle_Name"
        Students2DataGridView.Columns(2).HeaderText = "Surname"
        Students2DataGridView.Columns(3).HeaderText = "Section"
        Students2DataGridView.Columns(4).HeaderText = "Students_Number"
        Students2DataGridView.Columns(5).HeaderText = "Contact_Number"
        Students2DataGridView.Columns(6).HeaderText = "Email"
        Students2DataGridView.Columns(7).HeaderText = "Age"
        Students2DataGridView.Columns(8).HeaderText = "Gender"

        conn.Close()
    End Sub

    Private Sub TextBox1_Click(sender As Object, e As EventArgs) 
        TextBox2.Clear()
        TextBox3.Clear()
        TextBox4.Clear()
    End Sub

    Private Sub TextBox2_Click(sender As Object, e As EventArgs) 
        TextBox1.Clear()
        TextBox3.Clear()
        TextBox4.Clear()
    End Sub

    Private Sub TextBox3_Click(sender As Object, e As EventArgs) 
        TextBox2.Clear()
        TextBox1.Clear()
        TextBox4.Clear()
    End Sub

    Private Sub TextBox4_Click(sender As Object, e As EventArgs) 
        TextBox2.Clear()
        TextBox3.Clear()
        TextBox1.Clear()
    End Sub

    Private Sub Students2DataGridView_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles Students2DataGridView.CellContentClick

    End Sub

    Private Sub Contact_NumberTextBox_KeyPress(sender As Object, e As KeyPressEventArgs) Handles Contact_NumberTextBox.KeyPress

        If Not (Asc(e.KeyChar) = 8) Then
            Dim allowedChars As String = "1234567890"
            If Not allowedChars.Contains(e.KeyChar.ToString.ToLower) Then
                e.KeyChar = ChrW(0)
                e.Handled = True
            End If
        End If
    End Sub

    Private Sub AgeTextBox_KeyPress(sender As Object, e As KeyPressEventArgs) Handles AgeTextBox.KeyPress
        If Not (Asc(e.KeyChar) = 8) Then
            Dim allowedChars As String = "1234567890"
            If Not allowedChars.Contains(e.KeyChar.ToString.ToLower) Then
                e.KeyChar = ChrW(0)
                e.Handled = True
            End If
        End If
    End Sub

    Private Sub NameTextBox_KeyPress(sender As Object, e As KeyPressEventArgs) Handles NameTextBox.KeyPress
        If Not (Asc(e.KeyChar) = 8) Then
            Dim allowedChars As String = "abcdefghijklmnopqrstuvwxyz"
            If Not allowedChars.Contains(e.KeyChar.ToString.ToLower) Then
                e.KeyChar = ChrW(0)
                e.Handled = True
            End If
        End If
    End Sub

    Private Sub Middle_NameTextBox_KeyPress(sender As Object, e As KeyPressEventArgs) Handles Middle_NameTextBox.KeyPress
        If Not (Asc(e.KeyChar) = 8) Then
            Dim allowedChars As String = "abcdefghijklmnopqrstuvwxyz"
            If Not allowedChars.Contains(e.KeyChar.ToString.ToLower) Then
                e.KeyChar = ChrW(0)
                e.Handled = True
            End If
        End If
    End Sub

    Private Sub SurnameTextBox_KeyPress(sender As Object, e As KeyPressEventArgs) Handles SurnameTextBox.KeyPress
        If Not (Asc(e.KeyChar) = 8) Then
            Dim allowedChars As String = "abcdefghijklmnopqrstuvwxyz"
            If Not allowedChars.Contains(e.KeyChar.ToString.ToLower) Then
                e.KeyChar = ChrW(0)
                e.Handled = True
            End If
        End If
    End Sub

    Private Sub Students_NumberTextBox_KeyPress(sender As Object, e As KeyPressEventArgs) Handles Students_NumberTextBox.KeyPress
        If Not (Asc(e.KeyChar) = 8) Then
            Dim allowedChars As String = "1234567890-"
            If Not allowedChars.Contains(e.KeyChar.ToString.ToLower) Then
                e.KeyChar = ChrW(0)
                e.Handled = True
            End If
        End If
    End Sub

    Private Sub GenderTextBox_KeyPress(sender As Object, e As KeyPressEventArgs) Handles GenderTextBox.KeyPress
        If Not (Asc(e.KeyChar) = 8) Then
            Dim allowedChars As String = "malef"
            If Not allowedChars.Contains(e.KeyChar.ToString.ToLower) Then
                e.KeyChar = ChrW(0)
                e.Handled = True
                MsgBox("Male or Female Only!")
            End If
        End If
    End Sub
End Class