# Copyright (c) 2019 LG Electronics, Inc.

# Need this to launch anything ROS.
ROS_EXEC_DEPENDS += "\
    ros-workspace \
    rosidl-generator-cpp \
    rosidl-typesupport-c \
"

# Avoid large development dependencies in final image
ROS_EXEC_DEPENDS:remove = " \
    launch-testing \
    launch-testing-ament-cmake \
    launch-testing-ros \
"
ROS_TEST_DEPENDS:append = " \
    launch-testing \
    launch-testing-ament-cmake \
    launch-testing-ros \
"
