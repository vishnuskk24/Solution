
import cv2
import time
import os
from time import strftime


dateInStr=str(strftime("%mi%di%Y %Hii%M"))
print(dateInStr)
cap = cv2.VideoCapture(0)
ret,frame=cap.read();
filename = "../../../Images/LoginImages/capture "+dateInStr+".jpg"

cv2.imwrite(filename,frame)
cap.release()
# time.sleep(3)
command = str("start \"\" \"d:\Images\LoginImages\capture "+dateInStr+".jpg\"")

os.system(command)
os.system("cls")
# start "" "Images\LoginImages\capture 11i05i2023 18ii16.jpg"
