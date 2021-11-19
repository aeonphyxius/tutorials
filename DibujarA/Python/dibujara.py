
def DibujarA():
    display = ""

    AHORIZONTAL = 12
    AVERTICAL = 6

    
    for i in range (0, AVERTICAL):
        for j in range ( 0, AHORIZONTAL):
            if i == 0 and j == AHORIZONTAL / 2:
                display += "*"
            
            elif  i>0 and  ( j == (AHORIZONTAL / 2 - i ) or j == (AHORIZONTAL / 2 + i )) :
                display += "*"

            elif  i == AVERTICAL / 2  and  j > AHORIZONTAL / 2 - i and  j < AHORIZONTAL / 2 + i:
                display += "*"

            else:
                display += "_"

        display += "\n"

    print (display)
    

DibujarA()

# /*

# _____*______  
# ____*__*____ 
# ___*____*___ 
# __********__
# _*________*_
# *__________*        

# ______*______
# _____*_*____
# ____*___*___
# ___*_____*__
# __*_______*_
# _*_________*

# */