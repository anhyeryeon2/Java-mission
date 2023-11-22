# import numpy as np

# #Numpy를 이용하여 100x100 크기의 random 행렬을 생성 (값의 범위 : 0에서 1 사이)
# matrix = np.random.rand(100, 100)

# # (1) 10,000개의 원소 중 가장 큰 값과 그 위치를 찾는다
# max_value = np.max(matrix)
# max_positions = np.where(matrix == max_value)
# print("최대값:", max_value)
# print("최대값의 위치:", max_positions)
# print("")

# # (2)  10,000개의 원소 중 0.5에 가장 가까운 과 그 위치를 (x,y)의 형태로 찾는다.
# # x = 10,000개의 원소 중 0.5에 가장 가까운
# x = np.abs(matrix - 0.5)  # 절대값으로 차이 계산하기
# x_position = np.argmin(x)  # 젤 작은 차이가진거 그 위치 찾기
# row = x_position // 100  # 2차원으롭 바꿔야지
# column = x_position % 100
# x_position_x_y = (row, column)  # x,y 형태로 바꿈

# print("0.5와 가장 가까운 값:", matrix[row, column])
# print("0.5와 가장 가까운 값의 위치:", x_position)
# print("(k,y)의 형태로 변환", x_position_x_y)
# print("")

# # (3) 배열값에 100을 곱하고 반올림한 값이 3의 배수지만 4의 배수는 아닌 값 및 그 위치를 (x,y)의 형태로 찾는다.
# # M =  반올림한 값이 3의 배수지만 4의 배수는 아닌 값
# rounded = np.round(matrix * 100)
# M = (rounded % 3 == 0) & (rounded % 4 != 0)
# M_positions = np.where(M)

# print("조건을 만족하는 값들의 위치:", M_positions)

# # # (4) 1,2,3 을 열번호 30~50, 행번호 70~90에 대하여 반복하여라
# # submatrix = matrix[70:91, 30:51] 

# # (4) 부분행렬에 대한 연산 반복
# submatrix = matrix[70:90, 30:50]  # 정확한 범위 지정

# # 부분행렬의 최대값과 위치 찾기
# sub_max_value = np.max(submatrix)
# sub_max_position = np.unravel_index(np.argmax(submatrix), submatrix.shape)
# print("부분행렬 최대값:", sub_max_value)
# print("부분행렬 최대값의 위치:", (sub_max_position[0] + 70, sub_max_position[1] + 30))

# # 부분행렬의 0.5에 가장 가까운 값과 위치 찾기
# sub_closest_to_half = np.abs(submatrix - 0.5).argmin()
# sub_closest_to_half_position = np.unravel_index(sub_closest_to_half, submatrix.shape)
# print("부분행렬 0.5와 가장 가까운 값:", submatrix[sub_closest_to_half_position])
# print("부분행렬 0.5와 가장 가까운 값의 위치:", (sub_closest_to_half_position[0] + 70, sub_closest_to_half_position[1] + 30))

# # 부분행렬의 조건을 만족하는 값들의 위치 찾기
# sub_rounded = np.round(submatrix * 100)
# sub_condition = (sub_rounded % 3 == 0) & (sub_rounded % 4 != 0)
# sub_positions = np.argwhere(sub_condition)
# sub_positions_adjusted = sub_positions + [70, 30]
# print("부분행렬 조건을 만족하는 값들의 위치:", sub_positions_adjusted)

import numpy as np

# 사용자 입력 받기
n = int(input("n 값을 입력하세요 (정수): "))
m = int(input("m 값을 입력하세요 (정수): "))

# 1부터 n까지의 숫자 배열 생성
nums = np.arange(1, n + 1)

# m개의 0이 있는 배열 생성
zeros = np.zeros(m)

# 숫자와 0을 번갈아가며 배열에 채우기
result = np.zeros(n * (m + 1) - m)
result[::m+1] = nums

# 결과 출력
print(result)
