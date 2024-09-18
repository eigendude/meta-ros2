# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "This contains CvBridge, which converts between ROS2     Image messages and OpenCV images."
AUTHOR = "Kenji Brameld <kenjibrameld@gmail.com>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/cv_bridge"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & BSD"
LICENSE = "Apache-2.0 & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "vision_opencv"
ROS_BPN = "cv_bridge"

ROS_BUILD_DEPENDS = " \
    boost \
    opencv \
    python3-numpy \
    rclcpp \
    rcpputils \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    python-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    opencv \
    python3-numpy \
    rclcpp \
    rcpputils \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    boost \
    opencv \
    python3-numpy \
    rclcpp \
    rcpputils \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/vision_opencv-release/archive/release/jazzy/cv_bridge/4.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/cv_bridge"
SRC_URI = "git://github.com/ros2-gbp/vision_opencv-release;${ROS_BRANCH};protocol=https"
SRCREV = "d30ec40f8ebf943aaa16b860166e53a49a6f6174"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
