# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "A set of ROS2 message filters which take in messages and may output those messages at a later time, based on the conditions that filter needs met."
AUTHOR = "Ethan Gao <ethan.gao@linux.intel.com>"
ROS_AUTHOR = "Josh Faust"
HOMEPAGE = "https://github.com/intel/ros2_message_filters"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "message_filters"
ROS_BPN = "message_filters"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    rclcpp \
    rclpy \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-python-native \
    ament-cmake-ros-native \
    python-cmake-module-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    sensor-msgs \
    std-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros2_message_filters-release/archive/release/eloquent/message_filters/3.2.3-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/message_filters"
SRC_URI = "git://github.com/ros2-gbp/ros2_message_filters-release;${ROS_BRANCH};protocol=https"
SRCREV = "f9b4374b17d801df54b74e50d3f9c1a061dbde84"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('message-filters', d)}"
ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
