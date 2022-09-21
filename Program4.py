#Program 4 of barclays by Big Poppa...

inp = input(">> Enter the string...")
#Function to concatenate the members of a list
def concatenator(List):
    conc = ""
    for i in range(len(List)):
        conc += List[i]
    return conc


#Function a()
def a(str):
    new_str = list(str)
    for i in range(1,len(new_str)):        
        new_str[i] = new_str[i].upper()

    return concatenator(new_str)


#Function b()
def b(str):
    new_str = list(str)
    for i in range(len(new_str)):        
        new_str[i] = new_str[i].upper()
        
    return concatenator(new_str)

#Function c()
def c(str):
    new_str = list(str)
    for i in range(len(new_str)):        
        new_str[i] = new_str[i].lower()
        
    return concatenator(new_str)


#Function d()
def d(str):
     new_str = list(str)
     for i in range(len(new_str)):        
        new_str[i] = new_str[i].lower()
        
     return concatenator(new_str)

#Comparing and printing the results
print("Using a() ->",a(inp))
print("Using b() ->",b(inp))
print("Using c() ->",c(inp))
print("Using d() ->",d(inp))