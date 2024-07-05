
# Import pandas
import pandas
from pandas import ExcelWriter

# Create a dictionary that will be used to create the DataFrame
data = {
    'FirstName':["Satvik", "Avinash", "Lahri"],
    'LastName':["Shah", "Kati", "Rath"],
    'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)

# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(excel_writer=writer, sheet_name="sheet1", index = True)

# Commit data to the Excel file

writer._save()

# read from the excel file

dataframe = pandas.read_excel('sample.xlsx')

# Print the dataframe
print(dataframe)

# Print the number of rows and columns
print("====================================")
print("Number of rows and columns:", dataframe.shape)
# Print the number of rows
print("====================================")
print("Number of rows ", dataframe.shape[0])
# Print the number of coloumns
print("====================================")
print("Number of coloumns ", dataframe.shape[1])

# Print the data in the emails column only
print("====================================")
print("Emails:")
print(dataframe['Email'])


# Sort the data based on FirstName in ascending order and print the data
print("====================================")
print("Sorted data:")
print(dataframe.sort_values('FirstName'))

